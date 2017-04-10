module.exports = {
    entry: './src/app.js',
    devtool: 'source-map',
    output: {
        filename: 'bundle.js',
        path: __dirname + '/dist'
    }
};
