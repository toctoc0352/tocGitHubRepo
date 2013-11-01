
/*
 * GET home page.
 */

exports.index = function(req, res){
  res.render('index', { 
	  title: 'Express' ,
	  test: res.__('TEST %s','JS') ,
	  test2: res.__('TEST2 %s %s','JS1','JS2') ,
  });
};