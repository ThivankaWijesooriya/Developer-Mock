$(document).ready(function () {

    /*------------------NAV BAR------------------*/

    function hideAllDropdowns() {
        $(".dropdown_content").hide();
        $(".mega_dropdown_wrapper").hide();
    }

    $("#support_dropdown").click(function () {

        if ($("#support_dropdown_content").is(":visible")) {
            $("#support_dropdown_content").hide();
        } else {
            hideAllDropdowns();
            $("#support_dropdown_content").show();
        }

    });
    $("#user_dropdown").click(function () {
        if ($("#user_dropdown_content").is(":visible")) {
            $("#user_dropdown_content").hide();
        } else {
            hideAllDropdowns();
            $("#user_dropdown_content").show();
        }
    });
    $("#notify_dropdown").click(function () {
        if ($("#notify_dropdown_content").is(":visible")) {
            $("#notify_dropdown_content").hide();
        } else {
            hideAllDropdowns();
            $("#notify_dropdown_content").show();
        }
    });
    $("#mega_dropdown").click(function () {
        if ($(".mega_dropdown_wrapper").is(":visible")) {
            $(".mega_dropdown_wrapper").hide();
        } else {
            hideAllDropdowns();
            $(".mega_dropdown_wrapper").show();
        }
    });
    $(".close_mg_trigger").click(function () {
        $(".mega_dropdown_wrapper").hide();
    });

    /*------------------NAV BAR------------------*/

    /*------------------student inquiry form------------------*/
    $(".addgroups").click(function () {
        $('.ui.modal.addgroups').modal('show');
    });
    $(".addusers").click(function () {
        $('.ui.modal.addusers').modal('show');
    });
    $(".changegroup").click(function () {
        $('.ui.modal.changegroup').modal('show');
    });
    /*------------------student inquiry form------------------*/

    /*-----------------Payments------------------------*/
    $(".addcategory").click(function () {
        $('.ui.modal.addcategory').modal('show');
    });

    function modifycat() {
        $('.ui.modal.addcategory').modal('show');
    }
    $(".createplan").click(function () {
        $('.ui.modal.payplan').modal('show');
    });

    function installaction() {

        $("#printarea").hide();
        $("#duepay").hide();

    }

    function fixedaction() {
        $("#printarea").show();
        $("#duepay").show();

    }
    $(".addpenaltybtn").click(function () {
        $('.ui.modal.addpenalty').modal('show');
    });
    $(".modifybtn").click(function () {
        $('.ui.modal.addpenalty').modal('show');
    });
    /*-----------------Payments------------------------*/

    /*-----------------Academic partner------------------------*/



    /*-----------------Academic partner------------------------*/
});


