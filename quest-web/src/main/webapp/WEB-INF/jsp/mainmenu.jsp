<%--<%@ include file="common/header.jsp" %>--%>
<%@ include file="common/hello.jsp" %>

<div id="jqt">

<div id="about" class="selectable">
    <p><img src="jqtouch.png" /></p>
    <p><strong>Captial City Quiz</strong><br>Version 1.0 beta<br>
        <a href="http://www.com.corrsolutions.com">By Joel Mahatsri</a></p>
    <p><em>Create powerful mobile apps with<br> just HTML, CSS, and jQuery.</em></p>
    <p>
        <a target="_blank" href="http://twitter.com/joelcorr">@joelcorr on Twitter</a>
    </p>
    <p><br><br><a href="#" class="grayButton goback">Close</a></p>
</div>

<div id="ajax">
    <div class="toolbar">
        <h1>Play</h1>
        <a class="back" href="#home">Home</a>
    </div>
    <div class="scroll">
        <ul class="rounded">
            <li class="arrow"><a href="#ajax_post">POST Form Example</a></li>
            <li class="arrow"><a href="ajax.html">GET Example</a></li>
            <li class="arrow"><a href="ajax_long.html">Long GET Example</a></li>
            <li class="arrow"><a href="#callback">With Callback</a></li>
        </ul>
    </div>
</div>

<div id="learn">
    <div class="toolbar">
        <h1>Learn</h1>
        <a class="back" href="#">Home</a>
    </div>
    <div class="scroll">
        <h2>Most Popular</h2>
        <ul class="rounded">
            <li><a href="#animdemo">Slide</a></li>
            <li><a href="#animdemo" class="slideup">Slide Up</a></li>
            <li><a href="#animdemo" class="dissolve">Dissolve</a></li>
            <li><a href="#animdemo" class="pop">Pop</a></li>
        </ul>
        <h2>3d Transitions</h2>
        <ul class="rounded">
            <li><a href="#animdemo" class="flipright">Flip right</a></li>
            <li><a href="#animdemo" class="flipleft">Flip left</a></li>
            <li><a href="#animdemo" class="cube">Cube</a></li>
            <li><a href="#animdemo" class="swap">Swap</a></li>
        </ul>
    </div>
    <div class="info">
        Custom animations are also <a target="_blank" href="http://code.google.com/p/jqtouch/wiki/Animations">easy to write</a>. <br>View the source in <code>demos/customanimation</code> to see how.
    </div>
</div>

<div id="animations2">
    <div class="toolbar">
        <h1>Scores</h1>
        <a href="#" class="back">Animations</a>
    </div>
    <div class="scroll">
        <ul class="rounded">
        </ul>
    </div>
</div>

<div id="animdemo">
    <div style="font-size: 1.5em; text-align: center; margin: 160px 0 90px; font-family: Marker felt;">
        Pretty smooth, eh?
    </div>
    <a style="margin-bottom: 120px;color:rgba(0,0,0,.9)" href="#" class="whiteButton goback">Go back</a>
</div>

<div id="buttons">
    <div class="toolbar">
        <h1>Buttons!</h1>
        <a href="#" class="back">Home</a>
    </div>
    <div style="margin-top: 10px;" class="scroll">
        <a href="#" class="whiteButton">White</a>
        <br>
        <a href="#" class="grayButton">Gray</a>
        <br>
        <a href="#" class="redButton">Red</a>
        <br>
        <a href="#" class="greenButton">Green</a>
    </div>
</div>

<div id="callback">
    <div class="toolbar">
        <h1>AJAX w/Callback</h1>
        <a class="back" href="#">Ajax</a>
    </div>
</div>

<div id="callbacks">
    <div class="toolbar">
        <h1>Settings</h1>
        <a class="back" href="#home">Home</a>
    </div>
    <div class="scroll">
        <ul class="rounded">
            <li id="orient">Orientation: <strong>portrait</strong></li>
            <li><a href="#pageevents" data-custom="WOOT!">Page events</a></li>
            <li><a href="#" id="swipeme">Swipe me!</a></li>
            <li><a href="#" id="tapme">Tap me!</a></li>
        </ul>
    </div>
</div>
<div id="demos">
    <div class="toolbar">
        <h1>Demos</h1>
        <a class="back" href="#home">Home</a>
    </div>
    <div class="scroll">

        <ul class="rounded">
            <li class="forward"><a target="_blank" href="../todo/">To-Do app</a></li>
            <li class="forward"><a target="_blank" href="../clock/">Clock app</a></li>
        </ul>
    </div>
    <div class="info">
        These apps open in a new window. Don&#8217;t forget to save them to your home screen to enable full-screen mode.
    </div>
</div>
<div id="edge">
    <div class="toolbar">
        <h1>Edge to Edge</h1>
        <a href="#" class="back">Back</a>
    </div>
    <ul class="edgetoedge scroll">
        <li class="sep">F</li>
        <li><a href="#">Flintstone, <em>Fred</em> <small>Label</small></a></li>
        <li><a href="#">Flintstone, <em>Pebble</em> <small class="counter">42</small></a></li>
        <li><a href="#">Flintstone, <em>Wilma</em></a></li>
        <li class="sep">J</li>
        <li class="arrow"><a href="#">Jetson, <em>Elroy</em> <small>Label</small></a></li>
        <li class="arrow"><a href="#">Jetson, <em>George</em> <small class="counter">42</small></a></li>
        <li class="arrow"><a href="#">Jetson, <em>Jane</em></a></li>
        <li class="arrow"><a href="#">Jetson, <em>Judy</em></a></li>
        <li class="sep">R</li>
        <li class="forward"><a href="#">Rubble, <em>Bambam</em> <small>Label</small></a></li>
        <li class="forward"><a href="#">Rubble, <em>Barney</em> <small class="counter">42</small></a></li>
        <li class="forward"><a href="#">Rubble, <em>Betty</em></a></li>
    </ul>
</div>
<div id="themes">
    <div class="toolbar">
        <h1>Themes</h1>
        <a href="#" class="back">Back</a>
    </div>
    <ul class="rounded">
    </ul>
</div>
<div id="extensions">
    <div class="toolbar">
        <h1>Extensions</h1>
        <a class="back" href="#home">Home</a>
    </div>
    <div class="scroll">
        <div class="info">
            These apps open in a new window. Don&#8217;t forget to save them to your home screen to enable full-screen mode.
        </div>
        <ul class="rounded">
            <li class="forward"><a target="_blank" href="../ext_location/index.html">Geo Location</a></li>
            <li class="forward"><a target="_blank" href="../ext_offline/index.html">Offline Utility</a></li>
            <li class="forward"><a target="_blank" href="../ext_floaty/index.html">Floaty Bar</a></li>
            <li class="forward"><a target="_blank" href="../ext_autotitles/index.html">Auto Titles</a></li>
        </ul>
    </div>
</div>
<div id="forms">
    <div class="toolbar">
        <h1>Forms</h1>
        <a href="#" class="back">Back</a>
    </div>
    <form class="scroll">
        <ul class="edit rounded">
            <li><input type="text" name="name" placeholder="Text" id="some_name" /></li>
            <li><input type="search" name="search" placeholder="Search" id="some_name" /></li>
            <li><input type="tel" name="phone" placeholder="Phone" id="some_name"  /></li>
            <li><input type="number" name="zip" placeholder="Numbers" id="some_name" /></li>
            <li><input type="email" name="email" placeholder="Email" id="some_name" /></li>
            <li><input type="url" name="url" placeholder="Url" id="some_name" /></li>
            <li><textarea placeholder="Textarea" ></textarea></li>
            <li>Sample Toggle <span class="toggle"><input type="checkbox" /></span></li>
            <li class="arrow">
                <select id="lol">
                    <optgroup label="Swedish Cars">
                        <option value ="volvo">Volvo</option>
                        <option value ="saab">Saab</option>
                    </optgroup>
                    <optgroup label="German Cars">
                        <option value ="mercedes">Mercedes</option>
                        <option value ="audi">Audi</option>
                    </optgroup>
                </select>
            </li>
            <li><input type="password" name="some_name" value="iphonedelcopon" id="some_name" /></li>
            <li><input type="checkbox" name="food" value="punch" title="Punch" /></li>
            <li><input type="checkbox" name="food" value="pie" checked="checked" title="Pie" /></li>
            <li><input type="radio" name="bag" value="paper" title="Paper" /></li>
            <li><input type="radio" name="bag" value="plastic" title="Plastic" /></li>
        </ul>
    </form>
</div>
<div id="home" class="current">
    <div class="toolbar">
        <h1>Countries Captials Quiz!</h1>
        <a class="button slideup" id="infoButton" href="#about">About</a>
    </div>
    <div class="scroll">
        <ul class="rounded">
            <li class="arrow"><a href="#ui">User Interface <small class="counter">5</small></a> </li>
            <li class="arrow"><a href="#animations">Animations <small class="counter">7</small></a></li>
            <li class="arrow"><a href="#ajax">AJAX <small class="counter">4</small></a></li>
            <li class="arrow"><a href="#callbacks">Events <small class="counter">4</small></a></li>
            <li class="arrow"><a href="#extensions">Extensions <small class="counter">4</small></a> </li>
            <li class="arrow"><a href="#demos">Demos <small class="counter">2</small></a></li>
            <li class="arrow"><a href="#themes">Themes <small class="counter">2</small></a></li>
        </ul>
        <h2>External Links</h2>
        <ul class="rounded">
            <li class="forward"><a target="_blank" href="http://www.jqtouch.com/">Homepage</a></li>
            <li class="forward"><a target="_blank" href="http://twitter.com/#!/jqtouch">Twitter</a></li>
            <li class="forward"><a target="_blank" href="http://github.com/senchalabs/jQTouch">GitHub</a></li>
        </ul>
        <ul class="individual">
            <li><a target="_blank" href="http://twitter.com/!#/davidkaneda">@davidkaneda</a></li>
            <li><a target="_blank" href="http://twitter.com/!#/beedesk">@beedesk</a></li>
        </ul>
        <div class="info">
            <p>Add this page to your home screen <br>for a richer experience.</p>
        </div>
    </div>
</div>
<div id="metal">
    <div class="toolbar">
        <h1>Metal Lists</h1>
        <a href="#" class="back">Back</a>
    </div>
    <ul class="metal scroll">
        <li class="arrow"><a href="#"><small>AM</small> 9:40 <em>Buenos Aires</em></a></li>
        <li class="arrow"><a href="#"><small>PM</small> 19:40 <em>Singapur</em></a></li>
        <li class="arrow"><a href="#"><small>PM</small> 22:40 <em>Japan</em></a></li>
        <li class="arrow"><a href="#"><small>PM</small> 11:40 <em>New York</em></a></li>
        <li class="arrow"><a href="#"><small>PM</small> 9:40 <em>Ontario</em></a></li>
    </ul>
</div>
<div id="pageevents">
    <div class="toolbar">
        <h1>Page Events</h1>
        <a class="back" href="#">Events</a>
    </div>
    <div class="info scroll" style="font-weight: normal;">
    </div>
</div>
<div id="plastic">
    <div class="toolbar">
        <h1>Plastic Lists</h1>
        <a href="#" class="back">Back</a>
    </div>
    <ul class="plastic scroll">
        <li class="arrow"><a href="#">Simple list <small>Label</small></a></li>
        <li class="arrow"><a href="#">Contact list <small class="counter">42</small></a></li>
        <li class="forward"><a href="#">Content List</a></li>
        <li><a href="#">Metal list</a></li>
    </ul>
</div>
<div id="ui">
    <div class="toolbar">
        <h1>UI Demos</h1>
        <a class="back" href="#">Home</a>
    </div>
    <div class="scroll">
        <h2>Lists</h2>
        <ul class="rounded">
            <li class="arrow"><a href="#edge">Edge to Edge</a></li>
            <li class="arrow"><a href="#plastic">Plastic</a></li>
            <li class="arrow"><a href="#metal">Metal</a></li>
        </ul>
        <h2>Buttons</h2>
        <ul class="rounded">
            <li class="arrow"><a href="#buttons">Buttons</a></li>
        </ul>
        <h2>Forms</h2>
        <ul class="rounded">
            <li class="arrow"><a href="#forms">Forms</a></li>
        </ul>
    </div>
</div>
<form id="ajax_post" action="ajax_post.php" method="POST" class="form">
    <div class="toolbar">
        <h1>Post Demo</h1>
        <a class="back" href="#">Ajax</a>
    </div>
    <div class="scroll">
        <ul class="rounded">
            <li><input type="text" name="zip" value="" placeholder="Zip Code" /></li>
        </ul>
        <h2>Favorite color?</h2>
        <ul class="rounded">
            <li><input type="radio" name="color" value="green" title="Green" /></li>
            <li><input type="radio" name="color" value="blue" title="Blue" /></li>
            <li><input type="radio" name="color" value="red" title="Red" /></li>
        </ul>
        <a style="margin-top: 10px; margin-bottom: 10px; color:rgba(0,0,0,.9)" href="#" class="submit whiteButton">Submit</a>
    </div>
</form>
</div>

<link rel="stylesheet" href="../../themes/css/jqtouch.css" title="jQTouch">

<script src="../../src/lib/zepto.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../../src/jqtouch.min.js" type="text/javascript" charset="utf-8"></script>
<!-- Uncomment the following two lines (and comment out the previous two) to use jQuery instead of Zepto. -->
<!-- <script src="../../src/lib/jquery-1.7.min.js" type="application/x-javascript" charset="utf-8"></script> -->
<!-- <script src="../../src/jqtouch-jquery.min.js" type="application/x-javascript" charset="utf-8"></script> -->

<script src="../../extensions/jqt.themeswitcher.min.js" type="application/x-javascript" charset="utf-8"></script>

<script type="text/javascript">

    $(function() {
        $("#save").click(function(event) {
            $("#user").attr("action", "/quest-web/create")
            $("#user").submit();
        });

        $("#search").click(function(event) {
            $("#user").attr("action", "/quest-web/search")
            $("#user").submit();
        });
    });

</script>

<script type="text/javascript" charset="utf-8">
    var jQT = new $.jQTouch({
        icon: 'jqtouch.png',
        icon4: 'jqtouch4.png',
        addGlossToIcon: false,
        startupScreen: 'jqt_startup.png',
        statusBar: 'black-translucent',
        themeSelectionSelector: '#jqt #themes ul',
        preloadImages: []
    });

    // Some sample Javascript functions:
    $(function(){

        // Show a swipe event on swipe test
        $('#swipeme').swipe(function(evt, data) {
            var details = !data ? '': '<strong>' + data.direction + '/' + data.deltaX +':' + data.deltaY + '</strong>!';
            $(this).html('You swiped ' + details );
            $(this).parent().after('<li>swiped!</li>')
        });

        $('#tapme').tap(function(){
            $(this).parent().after('<li>tapped!</li>')
        });

        $('a[target="_blank"]').bind('click', function() {
            if (confirm('This link opens in a new window.')) {
                return true;
            } else {
                return false;
            }
        });

        // Page animation callback events
        $('#pageevents').
                bind('pageAnimationStart', function(e, info){
                    $(this).find('.info').append('Started animating ' + info.direction + '&hellip;  And the link ' +
                            'had this custom data: ' + $(this).data('referrer').data('custom') + '<br>');
                }).
                bind('pageAnimationEnd', function(e, info){
                    $(this).find('.info').append('Finished animating ' + info.direction + '.<br><br>');

                });

        // Page animations end with AJAX callback event, example 1 (load remote HTML only first time)
        $('#callback').bind('pageAnimationEnd', function(e, info){
            // Make sure the data hasn't already been loaded (we'll set 'loaded' to true a couple lines further down)
            if (!$(this).data('loaded')) {
                // Append a placeholder in case the remote HTML takes its sweet time making it back
                // Then, overwrite the "Loading" placeholder text with the remote HTML
                $(this).append($('<div>Loading</div>').load('ajax.html .info', function() {
                    // Set the 'loaded' var to true so we know not to reload
                    // the HTML next time the #callback div animation ends
                    $(this).parent().data('loaded', true);
                }));
            }
        });
        // Orientation callback event
        $('#jqt').bind('turn', function(e, data){
            $('#orient').html('Orientation: ' + data.orientation);
        });

    });
</script>

<style type="text/css" media="screen">
    #jqt.fullscreen #home .info {
        display: none;
    }
    div#jqt #about {
        padding: 100px 10px 40px;
        text-shadow: rgba(0, 0, 0, 0.3) 0px -1px 0;
        color: #999;
        font-size: 13px;
        text-align: center;
        background: #161618;
    }
    div#jqt #about p {
        margin-bottom: 8px;
    }
    div#jqt #about a {
        color: #fff;
        font-weight: bold;
        text-decoration: none;
    }
</style>

<%@ include file="common/footer.jsp" %>