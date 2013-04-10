/**
 * Model
 */
//Model : アイスクリーム一覧
var IcecreamModel = {
	list : [
		{id:'t1', name:'バニラ'},
		{id:'t2', name:'チョコレート'},
		{id:'t3', name:'ストロベリー'},
		{id:'t4', name:'抹茶'},
	],
	// すべてのアイスクリームを返す
	getAll : function(){
		return this.list;
	},
	// IDで指定したアイスクリームオブジェクトを返す
	findById : function(id){
		return $.grep(this.list, function(val){
			return id == val.id;
		})[0];
	},
};

//Model : 選択されているアイスクリームの管理
var SelectionModel = {
	// 選択されているアイスクリームが入る
	list : [],
	
	// アイスクリームの最大選択個数
	icecreamMaxCount : 2,
	
	// アイスクリームの追加
	add : function(item) {
		var list = this.list;
		list.push(item);
		if(list.length > icecreamMaxCount){
			// アイスクリーム制限個数以上の場合は
			// 0番目を捨てる
			list.shift();
		}
		// Viewを更新
		this.updateView();
	},
	
	// 指定したアイスクリームが選択されていればtrueが返る
	contain : function(icecream){
		return this.list.indexOf(icecream);
	},
	
	// IDで指定したアイスクリームが選択されていればtrueが返る
	containById : function(id){
		return this.contain(icecreamModel.findById(id));
	},
	
	// 選択されているアイスクリームを返す
	getIcecreams : function(){
		return this.list;
	},
	
	// Viewを更新する
	updateView : function(){
		updateSelection();
		updateSelectionIcecreamList();
		
	}
};
/**
 * View
 */
// アイスクリーム一覧を構築
$(function (){
	var icecreamListElm = $('#icecreams');
	var allIcecreamList = IcecreamModel.getAll();
	$.each(allIcecreamList,
		function(i, icecream){
			icecreamListElm.append(
				$('<li>')
					.append($('<input type="checkbox">').attr('name',icecream.id))
						.append($('<span>').text(icecream.name))
					.click(function() {
						// TODO: ここでコントローラ呼び出し
					})
			);
		}
	);
});

// View : チェックボックスを更新するView
function updateSelection() {
	$('#icecreams input[type="checkbox"]').each(function(i, elm){
		elm.checked = SelectionModel.containById(elm.name);
	});
};

// View : 選択順序を更新するView
function updateSelectionIcecreamList(){
	// 選択されたアイスクリーム一覧から
	// アイスクリーム名を集めて ' > 'で連結して表示
	$('#icecream-list').text(
		$.map(SelectionModel.getIcecreams(), function(val){
			return val.name;
		}).join(' > ')
	);
};
