// You can also use "$(window).load(function() {"
$(function () {
  // Slideshow 4
  $("#slider3").responsiveSlides({
    auto: true,
    pager: false,
    nav: false,
    speed: 500,
    namespace: "callbacks",
    before: function () {
      $('.events').append("<li>before event fired.</li>");
    },
    after: function () {
      $('.events').append("<li>after event fired.</li>");
    }
  });
	$("#select_city").change(function(){
		console.log("change");
	 	var  city = $("#select_city option:selected").val();
 		switch(city)
 		{
 			case "1":
 				$("#city_cuisine").attr("src","/images/guangzhou.jpg");
 				$("#food-title").text("虾饺");
 				$("#food-intro").text("虾饺是广东地区著名的传统小吃，属粤菜系，馅料有虾，有肉，有笋，味道鲜美爽滑，美味可口。");
 				$("#food-link").attr("href", "/cuisine_detail/虾饺");
 				break;
 			case "2":
 				$("#city_cuisine").attr("src","/images/shanghai.png");
 				$("#food-title").text("小笼包");
 				$("#food-intro").text("小笼包是上海、南京、杭州等江南地区著名的传统小吃，选用上等面粉制作，选料精细，皮薄卤多、口味鲜甜。");
 				$("#food-link").attr("href", "/cuisine_detail/小笼包");
 				break;
 			case "3":
 				$("#city_cuisine").attr("src","/images/beijing.jpeg");
 				$("#food-title").text("烤鸭");
 				$("#food-intro").text("烤鸭是具有世界声誉的北京著名菜式，色泽红艳，肉质细嫩，味道醇厚，肥而不腻。");
 				$("#food-link").attr("href", "/cuisine_detail/烤鸭");
 				break;
 		}
	});
});

