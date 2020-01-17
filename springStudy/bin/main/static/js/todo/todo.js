const ajaxHttp = (url,method,body,headers )=>{
	
	if(headers === undefined){
		headers = new Headers();
	}
	console.log(url);
	return fetch(url,{
			method  ,
			body ,
			headers 
			
		}).then((res)=> {
			console.log("then   " + url);
			return res.json();}
			

		).catch(err => err)

};

const callvalue = (json) =>{

};

const innerData = (id,data) =>{
	let doc = document.getElementById(id);
	doc.innerHTML=data;
};
//textAreaCall

const testAdd = async () =>{
	let data = await ajaxHttp("/todo/list","get");
	
	innerData("textAreaCall",JSON.stringify(data));
}


 const _init = async  () =>{
	let json =  await  ajaxHttp("/todo/list","get");
	let json2 = await  ajaxHttp("/todo/lists","get");
	console.dir(JSON.stringify(json));
	console.dir(JSON.stringify(json2));
	 
	console.log("aa")
	
};


