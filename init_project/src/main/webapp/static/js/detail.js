// Remember set you events before call bootstrapSwitch or they will fire after bootstrapSwitch's events
$(function () {
if ($("#food-name").text() == "虾饺") {
	$("#food-pic").attr("src", "/images/guangzhou.jpg");
	$("#food-info").text("虾饺是广东地区著名的传统小吃，属粤菜系，馅料有虾，有肉，有笋，味道鲜美爽滑，美味可口。");
}
else if ($("#food-name").text() == "小笼包") {
	$("#food-pic").attr("src", "/images/shanghai.png");
	$("#food-info").text("小笼包是上海、南京、杭州等江南地区著名的传统小吃，选用上等面粉制作，选料精细，皮薄卤多、口味鲜甜。");
}
else if ($("#food-name").text() == "烤鸭") {
	$("#food-pic").attr("src", "/images/beijing.jpeg");
	$("#food-info").text("烤鸭是具有世界声誉的北京著名菜式，色泽红艳，肉质细嫩，味道醇厚，肥而不腻。");
}
else if ($("#food-name").text() == "扬州炒饭") {
	$("#food-pic").attr("src", "/images/menu1.jpg");
	$("#food-info").text("颗粒分明、粒粒松散、软硬有度、色彩调和、光泽饱满、配料多样、鲜嫩滑爽、香糯可口。");
}
else if ($("#food-name").text() == "鲜虾粥") {
	$("#food-pic").attr("src", "/images/menu2.jpg");
	$("#food-info").text("口感细腻软滑，营养丰富，清新爽口，提高食欲，增强体质。");
}
else if ($("#food-name").text() == "三明治") {
	$("#food-pic").attr("src", "/images/menu3.jpg");
	$("#food-info").text("夹腌牛肉、瑞士奶 酪、泡菜，并用俄式浇头盖在黑面包上烤热食用。");
}
else if ($("#food-name").text() == "牛肉面") {
	$("#food-pic").attr("src", "/images/menu4.jpg");
	$("#food-info").text("兰州的传统名食，在全国各地都会有“兰州正宗牛肉拉面”的招牌，我们的牛肉面正宗、爽口、实惠、价廉。");
}
else if ($("#food-name").text() == "章鱼小丸子") {
	$("#food-pic").attr("src", "/images/menu5.jpg");
	$("#food-info").text("起源于日本大阪，口感新鲜、味美，皮酥肉嫩。");
}
else if ($("#food-name").text() == "鸡扒饭") {
	$("#food-pic").attr("src", "/images/menu6.jpg");
	$("#food-info").text("肉质鲜嫩、香脆可口，食肉者的最佳选择。");
}

$("[name='checkbox2']").change(function() {
	if(!confirm('Do you wanna cancel me!')) {
		this.checked = true;
	}
});
$('#after').bootstrapNumber();
$('#colorful').bootstrapNumber({
	upClass: 'success',
	downClass: 'danger'
});


});