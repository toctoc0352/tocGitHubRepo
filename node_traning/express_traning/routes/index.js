
/*
 * GET home page.
 */

exports.index = function(req, res){
  //res.render('index', { title: req.__('HELLO') });
  res.render('index', { title: 'Express Exsample' });
};