let basePath = '../../../../src/scss/';

if ( !config.entry ) config.entry = [];
config.entry[Object.keys(config.entry).length] = basePath + 'bootstrap.scss';
config.entry[Object.keys(config.entry).length] = basePath + 'app.scss';

config.module.rules.push({
    test: /.scss$/,
    use: [
        {
            loader: 'file-loader',
            options: {
                name: '[name].css',
                outputPath: 'css/'
            }
        },
        {
            loader: 'extract-loader'
        },
        {
            loader: 'css-loader'
        },
        {
            loader: 'postcss-loader',
            options: {
                plugins: function() {
                    return [
                        require('autoprefixer')
                    ];
                }
            }
        },
        {
            loader: 'sass-loader'
        }
    ]
});