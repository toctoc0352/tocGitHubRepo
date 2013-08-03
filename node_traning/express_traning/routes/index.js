
/*
 * GET home page.
 */

exports.index = function(req, res){
  res.render('index', { title: res.__('TITLE') });
  //res.render('index', { title: 'Express Exsample' });
};