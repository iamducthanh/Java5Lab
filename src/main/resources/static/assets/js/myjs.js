function editMenu(){
    let left = document.getElementById("leftHH");
    let right = document.getElementById("rightHH");
    if(left.style.display == 'none'){
        left.style.display = 'unset';
        right.className = 'col-lg-10';
    } else {
        left.style.display = 'none';
        right.className = 'col-lg-12';
    }
}
function editMenuKH(){
    let left = document.getElementById("leftKH");
    let right = document.getElementById("rightKH");
    if(left.style.display == 'none'){
        left.style.display = 'unset';
        right.className = 'col-lg-9';
    } else {
        left.style.display = 'none';
        right.className = 'col-lg-12';
    }
}
let tabAddHH = document.getElementsByClassName("tabAddHH");
let headAddHH = document.getElementsByClassName("menuTab");
for(let i = 1;i<tabAddHH.length;i++){
    tabAddHH[i].style.display = 'none';
}
function onTabAddHH(index){
    for(let i = 0;i<tabAddHH.length;i++){
        if(i==index){
            headAddHH[i].style.borderBottom = '2px solid #564ab1'
            tabAddHH[i].style.display = 'unset';
        } else {
            headAddHH[i].style.borderBottom = '0px'
            tabAddHH[i].style.display = 'none';
        }
    }
}

let tabTTKH = document.getElementsByClassName("tabTTKH");
let headTTKH = document.getElementsByClassName("menuTabKH");
for(let i = 1;i<tabTTKH.length;i++){
    tabTTKH[i].style.display = 'none';
}
function onTabTTKH(index){
    for(let i = 0;i<tabTTKH.length;i++){
        if(i==index){
            headTTKH[i].style.borderBottom = '2px solid #564ab1'
            tabTTKH[i].style.display = 'unset';
        } else {
            headTTKH[i].style.borderBottom = '0px'
            tabTTKH[i].style.display = 'none';
        }
    }
}

let tabNCC = document.getElementsByClassName("tabNCC");
let headNCC = document.getElementsByClassName("menuTabNCC");
for(let i = 1;i<tabNCC.length;i++){
    tabNCC[i].style.display = 'none';
}
function onTabNCC(index){
    for(let i = 0;i<tabNCC.length;i++){
        if(i==index){
            headNCC[i].style.borderBottom = '2px solid #564ab1'
            tabNCC[i].style.display = 'unset';
        } else {
            headNCC[i].style.borderBottom = '0px'
            tabNCC[i].style.display = 'none';
        }
    }
}

let tabDTGH = document.getElementsByClassName("tabDTGH");
let headDTGH = document.getElementsByClassName("menuTabDTGH");
for(let i = 1;i<tabDTGH.length;i++){
    tabDTGH[i].style.display = 'none';
}
function onTabDTGH(index){
    for(let i = 0;i<tabDTGH.length;i++){
        if(i==index){
            headDTGH[i].style.borderBottom = '2px solid #564ab1'
            tabDTGH[i].style.display = 'unset';
        } else {
            headDTGH[i].style.borderBottom = '0px'
            tabDTGH[i].style.display = 'none';
        }
    }
}

const toBase64 = file => new Promise((resolve, reject) => {
    const reader = new FileReader();
    reader.readAsDataURL(file);
    reader.onload = () => resolve(reader.result);
    reader.onerror = error => reject(error);
});

function uuid() {
    var temp_url = URL.createObjectURL(new Blob());
    var uuid = temp_url.toString();
    URL.revokeObjectURL(temp_url);
    return uuid.substr(uuid.lastIndexOf('/') + 1);
}

function closeModalAddHH(){
    document.getElementById('modalAddHH').style.display = 'none'
}
function onModalAddHH(){
    document.getElementById('modalAddHH').style.display = 'unset'
}
function closeModalTTKH(){
    document.getElementById('tabTTKH').style.display = 'none'
}
function onModalTTKH(){
    document.getElementById('tabTTKH').style.display = 'unset'
}
function closeModalAddKH(){
    document.getElementById('tabAddKH').style.display = 'none'
}
function onModalAddKH(){
    document.getElementById('tabAddKH').style.display = 'unset'
}
function closeModalAddNCC(){
    document.getElementById('tabAddNCC').style.display = 'none'
}
function onModalAddNCC(){
    document.getElementById('tabAddNCC').style.display = 'unset'
}
function closeModalNCC(){
    document.getElementById('tabNCC').style.display = 'none'
}
function onModalNCC(){
    document.getElementById('tabNCC').style.display = 'unset'
}
function closeModalDTGH(){
    document.getElementById('tabDTGH').style.display = 'none'
}
function onModalDTGH(){
    document.getElementById('tabDTGH').style.display = 'unset'
}
function closeModalAddDTGH(){
    document.getElementById('tabAddDTGH').style.display = 'none'
}
function onModalAddDTGH(){
    document.getElementById('tabAddDTGH').style.display = 'unset'
}

$(function(){
    $('*').keyup(function(e){
        if(e.keyCode=='27'){
            document.getElementById('modalAddHH').style.display = 'none'
        }       
    })
  })
document.getElementById("rightHH").className = 'col-lg-10';

