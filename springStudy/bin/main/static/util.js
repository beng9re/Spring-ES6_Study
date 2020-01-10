function getDom (id) {
	return document.getElementById(id);
} 

function appendHtml (targetID,resourceID){
	let targetDom = getDom(targetID);
	let addDom =  document.createElement("div");
	addDom.innerHTML =`<object type="text/html" data=${resourceID}>`
	
	targetDom.appendChild(addDom);
};


export {getDom,appendHtml};

	
	