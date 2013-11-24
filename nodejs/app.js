/**
 * Created by ramos on 24/11/13.
 */

var http = require("http");

var srv = http.createServer(function(req, res) {

    var _result = {author: "Diego Ramos"};

    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE,OPTIONS');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type, Authorization, Content-Length, X-Requested-With');
    res.writeHead(200, {'Content-Type': 'application/json; charset=utf-8'});

    res.end( JSON.stringify( _result ) );

}).listen( 3000 );

