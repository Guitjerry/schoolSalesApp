// jQuery(document).ready(function($){
// 	var $form_modal = $('.cd-user-modal'),
// 		$form_login = $form_modal.find('#cd-login'),
// 		$form_signup = $form_modal.find('#cd-signup'),
// 		$form_modal_tab = $('.cd-switcher'),
// 		$tab_login = $form_modal_tab.children('li').eq(0).children('a'),
// 		$tab_signup = $form_modal_tab.children('li').eq(1).children('a'),
// 		$main_nav = $('.main_nav');
//
// 	//��������
// 	$main_nav.on('click', function(event){
//
// 		if( $(event.target).is($main_nav) ) {
// 			// on mobile open the submenu
// 			$(this).children('ul').toggleClass('is-visible');
// 		} else {
// 			// on mobile close submenu
// 			$main_nav.children('ul').removeClass('is-visible');
// 			//show modal layer
// 			$form_modal.addClass('is-visible');
// 			//show the selected form
// 			( $(event.target).is('.cd-signup') ) ? signup_selected() : login_selected();
// 		}
//
// 	});
//
// 	//�رյ�������
// 	$('.cd-user-modal').on('click', function(event){
// 		if( $(event.target).is($form_modal) || $(event.target).is('.cd-close-form') ) {
// 			$form_modal.removeClass('is-visible');
// 		}
// 	});
// 	//ʹ��Esc���رյ�������
// 	$(document).keyup(function(event){
//     	if(event.which=='27'){
//     		$form_modal.removeClass('is-visible');
// 	    }
//     });
//
// 	//�л���
// 	$form_modal_tab.on('click', function(event) {
// 		event.preventDefault();
// 		( $(event.target).is( $tab_login ) ) ? login_selected() : signup_selected();
// 	});
//
// 	function login_selected(){
// 		$form_login.addClass('is-selected');
// 		$form_signup.removeClass('is-selected');
// 		$form_forgot_password.removeClass('is-selected');
// 		$tab_login.addClass('selected');
// 		$tab_signup.removeClass('selected');
// 	}
//
// 	function signup_selected(){
// 		$form_login.removeClass('is-selected');
// 		$form_signup.addClass('is-selected');
// 		$form_forgot_password.removeClass('is-selected');
// 		$tab_login.removeClass('selected');
// 		$tab_signup.addClass('selected');
// 	}
//
// });

function checkZuoyeList(){
	if($('#usercode').val()==""||$('#usercode').val()==null){

		toastrErrorMessage("学生编号不能为空");
		return false;
	}
	if($('#password').val()==""||$('#password').val()==null){
		toastrErrorMessage("密码不能为空");
		return false;
	}
	$.ajax({
		"url":rootPath+"/app/score/checkLogin",
		data:{"usercode":$('#usercode').val(),"password":$('#password').val()},
		success:function (data) {
			if(data.successmsg!=undefined&&data.successmsg!=''){
				toastrSuccessMessage(data.successmsg);
				setTimeout(function () {
					location.href = rootPath+"/score/main.html?usercode="+data.usercode;
				},2000)

			}else{
				toastrErrorMessage(data.errormsg);
			}

		}
	})

}