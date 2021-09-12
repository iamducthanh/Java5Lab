!function (e) {
    "use strict";

    function a() {
        for (var t = document.getElementById("topnav-menu-content").getElementsByTagName("a"), e = 0, s = t.length; e < s; e++) "nav-item dropdown active" === t[e].parentElement.getAttribute("class") && (t[e].parentElement.classList.remove("active"), t[e].nextElementSibling.classList.remove("show"))
    }

    function s(t) {
        1 == e("#light-mode-switch").prop("checked") && "light-mode-switch" === t 
        ? 
        (e("html").removeAttr("dir"), e("#dark-mode-switch").prop("checked", !1), e("#rtl-mode-switch").prop("checked", !1), e("#bootstrap-style").attr("href", "assets/css/bootstrap.min.css"/*tpa=https://themesbrand.com/foxia/layouts/blue/assets/js/assets/css/bootstrap.min.css*/), e("#app-style").attr("href", "assets/css/app.min.css"/*tpa=https://themesbrand.com/foxia/layouts/blue/assets/js/assets/css/app.min.css*/), sessionStorage.setItem("is_visited", "light-mode-switch")) 
        : 
        1 == e("#dark-mode-switch").prop("checked") && "dark-mode-switch" === t ? (e("html").removeAttr("dir"), e("#light-mode-switch").prop("checked", !1), e("#rtl-mode-switch").prop("checked", !1), e("#bootstrap-style").attr("href", "assets/css/bootstrap-dark.min.css"/*assets/css/bootstrap-dark.min.css*/), e("#app-style").attr("href", "assets/css/app-dark.min.css"/*tpa=https://themesbrand.com/foxia/layouts/blue/assets/js/assets/css/app-dark.min.css*/), sessionStorage.setItem("is_visited", "dark-mode-switch")) 
        : 
        1 == e("#rtl-mode-switch").prop("checked") && "rtl-mode-switch" === t && (e("#light-mode-switch").prop("checked", !1), e("#dark-mode-switch").prop("checked", !1), e("#bootstrap-style").attr("href", "assets/css/bootstrap-rtl.min.css"/*tpa=https://themesbrand.com/foxia/layouts/blue/assets/js/assets/css/bootstrap-rtl.min.css*/), e("#app-style").attr("href", "app-rtl.min.css"/*tpa=https://themesbrand.com/foxia/layouts/blue/assets/js/assets/css/app-rtl.min.css*/), e("html").attr("dir", "rtl"), sessionStorage.setItem("is_visited", "rtl-mode-switch"))
    }

    var t;
    e("#side-menu").metisMenu(), e("#vertical-menu-btn").on("click", function (t) {
        t.preventDefault(), e("body").toggleClass("sidebar-enable"), 992 <= e(window).width() ? e("body").toggleClass("vertical-collpsed") : e("body").removeClass("vertical-collpsed")
    }), e("#sidebar-menu a").each(function () {
        var t = window.location.href.split(/[?#]/)[0];
        this.href == t && (e(this).addClass("active"), e(this).parent().addClass("mm-active"), e(this).parent().parent().addClass("mm-show"), e(this).parent().parent().prev().addClass("mm-active"), e(this).parent().parent().parent().addClass("mm-active"), e(this).parent().parent().parent().parent().addClass("mm-show"), e(this).parent().parent().parent().parent().parent().addClass("mm-active"))
    }), e(".navbar-nav a").each(function () {
        var t = window.location.href.split(/[?#]/)[0];
        this.href == t && (e(this).addClass("active"), e(this).parent().addClass("active"), e(this).parent().parent().addClass("active"), e(this).parent().parent().parent().addClass("active"), e(this).parent().parent().parent().parent().addClass("active"), e(this).parent().parent().parent().parent().parent().addClass("active"))
    }), e(".navbar-nav>li").slice(-1).addClass("last-elements"), e(document).ready(function () {
        var t;
        0 < e("#sidebar-menu").length && 0 < e("#sidebar-menu .mm-active .active").length && (300 < (t = e("#sidebar-menu .mm-active .active").offset().top) && (t -= 300, e(".vertical-menu .simplebar-content-wrapper").animate({scrollTop: t}, "slow")))
    }), e(".right-bar-toggle").on("click", function (t) {
        e("body").toggleClass("right-bar-enabled")
    }), e(document).on("click", "body", function (t) {
        0 < e(t.target).closest(".right-bar-toggle, .right-bar").length || e("body").removeClass("right-bar-enabled")
    }), function () {
        if (document.getElementById("topnav-menu-content")) {
            for (var t = document.getElementById("topnav-menu-content").getElementsByTagName("a"), e = 0, s = t.length; e < s; e++) t[e].onclick = function (t) {
                "#" === t.target.getAttribute("href") && (t.target.parentElement.classList.toggle("active"), t.target.nextElementSibling.classList.toggle("show"))
            };
            window.addEventListener("resize", a)
        }
    }(), [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]')).map(function (t) {
        return new bootstrap.Tooltip(t)
    }), [].slice.call(document.querySelectorAll('[data-bs-toggle="popover"]')).map(function (t) {
        return new bootstrap.Popover(t)
    }), window.sessionStorage && ((t = sessionStorage.getItem("is_visited")) ? (e(".right-bar input:checkbox").prop("checked", !1), e("#" + t).prop("checked", !0), s(t)) : sessionStorage.setItem("is_visited", "light-mode-switch")), e("#light-mode-switch, #dark-mode-switch, #rtl-mode-switch").on("change", function (t) {
        s(t.target.id)
    }), e(".toggle-search").on("click", function () {
        var t = e(this).data("target");
        t && e(t).toggleClass("open")
    }), e(window).on("load", function () {
        e("#status").fadeOut(), e("#preloader").delay(350).fadeOut("slow")
    }), Waves.init()
}(jQuery);