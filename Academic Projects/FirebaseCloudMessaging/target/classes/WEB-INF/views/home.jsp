<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Basic Communication</title>

<link href="<c:url value="/resources/vendor/semantic.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/assets/common.css" />"
	rel="stylesheet">

</head>

<body class="agora-theme">

	<div class="navbar-fixed">
		<nav class="agora-navbar">
			<div class="nav-wrapper agora-primary-bg valign-wrapper">
				<h5 class="left-align">Premier Go Video Call</h5>
			</div>
		</nav>
	</div>

	<div class="ui tiny modal" style="max-width: 50vh;">
	
		<div class="header" style="background-color: #000000d9 !important;"></div>
		<div class="content" style="background-color: #000000d9 !important;min-height:50vh">
			
			<div class="ui grid">

				<div class="row">
					<div class="eight wide column">
						<!-- <button class="ui fluid inverted green button">Green</button> -->
					</div>
					<div class="eight wide column">
						<!-- <button class="ui fluid inverted green button">Green</button> -->
					</div>
				</div>
				
				<div class="row">
					<div class="eight wide column">
						<!-- <button class="ui fluid inverted green button">Green</button> -->
					</div>
					<div class="eight wide column">
						<!-- <button class="ui fluid inverted green button">Green</button> -->
					</div>
				</div>
				
				<div class="row">
					<div class="eight wide column">
						<!-- <button class="ui fluid inverted green button">Green</button> -->
					</div>
					<div class="eight wide column">
						<!-- <button class="ui fluid inverted green button">Green</button> -->
					</div>
				</div>
				
				<div class="row">
					<div class="eight wide column">
						<button class="ui fluid inverted green button">Accept</button>
					</div>
					<div class="eight wide column">
						<button class="ui fluid inverted red button">Decline</button>
					</div>
				</div>

			</div>

		</div>
	</div>

	<form id="form" class="row col l12 s12">

		<div class="row container col l12 s12">
			<div class="col" style="min-width: 433px; max-width: 443px">
				<div class="card" style="margin-top: 0px; margin-bottom: 0px;">
					<div class="row card-content" style="margin-bottom: 0px;">
						<div class="input-field" id="synapsys-appid">
							<label for="appID" class="active">App ID</label> <input
								type="text" placeholder="App ID" name="appID"
								value="140ac5735c304b788e951f5147f75888">
						</div>
						<div class="input-field" id="synapsys-channel">
							<label for="channel" class="active">Channel</label> <input
								type="text" placeholder="channel" name="channel"
								value="synapsys">
						</div>
						<div class="input-field" id="synapsys-token">
							<label for="token" class="active">Token</label> <input
								type="text" placeholder="token" name="token">
						</div>
						<div class="row" style="margin: 0">
							<div class="col s12">
								<button
									class="btn btn-raised btn-primary waves-effect waves-light"
									id="join">JOIN</button>
								<button
									class="btn btn-raised btn-primary waves-effect waves-light"
									id="leave">LEAVE</button>
								<button
									class="btn btn-raised btn-primary waves-effect waves-light"
									id="publish">PUBLISH</button>
								<button
									class="btn btn-raised btn-primary waves-effect waves-light"
									id="unpublish">UNPUBLISH</button>
							</div>
						</div>
					</div>
				</div>
				<ul class="collapsible card agora-secondary-border"
					style="margin-top: .4rem; border: 1px">
					<li>
						<div class="collapsible-header agora-secondary-bg">

							<h6 class="center-align">ADVANCED SETTINGS</h6>

						</div>
						<div class="collapsible-body card-content">
							<div class="row">
								<div class="col s12">
									<div class="input-field">
										<label for="UID" class="active">UID</label> <input
											type="number" placeholder="UID" name="uid">
									</div>
									<div class="input-field">
										<label for="cameraId" class="active">CAMERA</label> <select
											name="cameraId" id="cameraId"></select>
									</div>
									<div class="input-field">
										<label for="microphoneId" class="active">MICROPHONE</label> <select
											name="microphoneId" id="microphoneId"></select>
									</div>
									<div class="input-field">
										<label for="cameraResolution" class="active">CAMERA
											RESOLUTION</label> <select name="cameraResolution"
											id="cameraResolution"></select>
									</div>
									<div class="row col s12">
										<div class="row">
											<label for="mode" class="active">MODE</label>
										</div>
										<div class="row">
											<label> <input type="radio" class="with-gap"
												name="mode" value="live" checked /> <span>live</span>
											</label> <label> <input type="radio" class="with-gap"
												name="mode" value="rtc" /> <span>rtc</span>
											</label>
										</div>
									</div>
									<div class="row col s12">
										<div class="row">
											<label for="codec" class="active">CODEC</label>
										</div>
										<div class="row">
											<label> <input type="radio" class="with-gap"
												name="codec" value="h264" checked /> <span>h264</span>
											</label> <label> <input type="radio" class="with-gap"
												name="codec" value="vp8" /> <span>vp8</span>
											</label>
										</div>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>

			<div class="col s7">
				<div class="video-grid" id="video">
					<div class="video-view">
						<div id="local_stream" class="video-placeholder"></div>
						<div id="local_video_info" class="video-profile hide"></div>
						<div id="video_autoplay_local" class="autoplay-fallback hide"></div>
					</div>
				</div>
			</div>

		</div>

	</form>

	<script src="<c:url value="/resources/vendor/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/vendor/materialize.min.js" />"></script>
	<script src="<c:url value="/resources/vendor/semantic.min.js" />"></script>
	<script src="https://cdn.agora.io/sdk/release/AgoraRTCSDK-3.2.3.js"></script>
	<script src="<c:url value="/resources/js/agora.js" />"></script>

	<!-- The core Firebase JS SDK-->
	<script src="https://www.gstatic.com/firebasejs/8.1.2/firebase-app.js"></script>
	<script
		src="https://www.gstatic.com/firebasejs/8.1.2/firebase-messaging.js"></script>
	<script src="<c:url value="/resources/js/app.js" />"></script>


</body>
</html>

