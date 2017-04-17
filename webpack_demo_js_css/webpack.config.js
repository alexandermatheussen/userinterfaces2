module.exports = {
    entry: './src/app.js',
    output: {
        filename: 'bundle.js',
        path: __dirname + '/dist'
    },
    devtool: 'source-map',
    module: {
        rules: [
            { test: /\.css$/, loader: "style-loader!css-loader" }
        ]
    }
};
