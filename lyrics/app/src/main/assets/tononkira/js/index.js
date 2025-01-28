/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
	let btn0 = document.getElementById("button0");
	btn0.addEventListener("click", myFunction0);
	let btn1 = document.getElementById("button1");
	btn1.addEventListener("click", myFunction1);
	let btn2 = document.getElementById("button2");
	btn2.addEventListener("click", myFunction2);
	let btn3 = document.getElementById("button3");
	btn3.addEventListener("click", myFunction3);
	let btn4 = document.getElementById("button4");
	btn4.addEventListener("click", myFunction4);
	let btn5 = document.getElementById("button5");
	btn5.addEventListener("click", myFunction5);
	let btn6 = document.getElementById("button6");
	btn6.addEventListener("click", myFunction6);
	let btn7 = document.getElementById("button7");
	btn7.addEventListener("click", myFunction7);
	let btn8 = document.getElementById("button8");
	btn8.addEventListener("click", myFunction8);
	let btn9 = document.getElementById("button9");
	btn9.addEventListener("click", myFunction9);
	let btnd = document.getElementById("buttond");
	btnd.addEventListener("click", myFunctiond);
	
	
	
	function myFunction0()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'0';
}
	function myFunction1()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'1';
}
	function myFunction2()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'2';
}
	function myFunction3()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'3';
}
	function myFunction4()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'4';
}
	function myFunction5()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'5';
}
	function myFunction6()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'6';
}
	function myFunction7()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'7';
}
	function myFunction8()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'8';
}
	function myFunction9()
{
	var butto = document.getElementById('final');
	butto.value=butto.value+'9';
}

	function myFunctiond()
{
	var butto = document.getElementById('final');
	var t=butto.value;
	var c=t.substring(0,t.length-1);
	butto.value=c;
}

let btnlink = document.getElementById('final');
	btnlink.addEventListener("click", myFunctionlink);
	
		function myFunctionlink()
{
		var butto = document.getElementById('final');
	 var linktoput=butto.value;
	 var link = document.getElementById('link');
//alert(linktoput);
link.href = linktoput+'.html';
}
// Wait for the deviceready event before using any of Cordova's device APIs.
// See https://cordova.apache.org/docs/en/latest/cordova/events/events.html#deviceready
document.addEventListener('deviceready', onDeviceReady, false);

function onDeviceReady() {
    // Cordova is now initialized. Have fun!

    console.log('Running cordova-' + cordova.platformId + '@' + cordova.version);
    document.getElementById('deviceready').classList.add('ready');
	
	

	
}



	

// Add an event handler for the click event


