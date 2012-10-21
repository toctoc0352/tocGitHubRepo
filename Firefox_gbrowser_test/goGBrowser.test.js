var description = 'gBrowser関連のテスト'
function startUp()
{
  // 前初期化処理
  // （クラス定義の読み込みなど、テストケース全体の最初に実行する処理）
  utils.include('goGBrowserTest.js');
};

function setUp() {
  // 初期化処理
  // （インスタンスの生成など、各テストを実行する前に必ず実行する内容）
};

function tearDown() {
  // 終了処理
  // （インスタンスの破棄など、各テストを実行する前に必ず実行する内容）
};

function shutDown()
{
  // 後終了処理
  // （テストケース全体の最後に実行する処理）
};

testWillSuccess.description = '成功するテストの例';
testWillSuccess.priority    = 'normal';
function testWillSuccess() {
  var gaa = new goGBrowserTest();
  utils.setUpTestWindow();
  var win = utils.getTestWindow();
  utils.addTab('http://www.google.co.jp/');
  utils.addTab('http://www.yahoo.co.jp/');  
  assert.isTrue(gaa.getLocalHost());
  win.close();  
};