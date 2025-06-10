/**
 * 页面跳转
 * @param {Object} url
 */
function jump(url) {
	if (!url || url == 'null' || url == null) {
		window.location.href = './index.html';
	}
	// 路径访问设置
	localStorage.setItem('iframeUrl', url.replace('../', './pages/'));
	window.location.href = url;
}

/**
 * 返回
 */
function back(num = -1) {
	window.history.go(num)
}

/**
 * 生成订单
 */
function genTradeNo() {
	var date = new Date();
	var tradeNo = date.getFullYear().toString() + (date.getMonth() + 1).toString() +
		date.getDate().toString() + date.getHours().toString() + date.getMinutes().toString() +
		date.getSeconds().toString() + date.getMilliseconds().toString();
	for (var i = 0; i < 5; i++) //5位随机数，用以加在时间戳后面。
	{
		tradeNo += Math.floor(Math.random() * 10);
	}
	return tradeNo;
}

function chatTap() {
	var userTable = localStorage.getItem('userTable');
	if (userTable) {
		layui.layer.open({
			type: 2,
			title: '客服聊天',
			area: ['600px', '600px'],
			content: './pages/chat/chat.html'
		});
	} else {
		window.location.href = './pages/login/login.html'
	}
}

// 导航栏跳转
function navPage(url) {
	localStorage.setItem('iframeUrl', url);
	window.location.href = url;
}

// 跳转到个人中心也
function centerPage() {
	var userTable = localStorage.getItem('userTable');
	if (userTable) {
		localStorage.setItem('iframeUrl', './pages/' + userTable + '/center.html');
		document.getElementById('iframe').src = './pages/' + userTable + '/center.html';
	} else {
		window.location.href = './pages/login/login.html'
	}
}
