const ajaxHttp = (url , method,body,headers )=>{
	
	if(headers === undefined){
		headers = new Headers();
	}
	
	let returnValue = fetch(url,{
			method : method ,
			body ,
			headers : headers
			
		}).then((res)=>{
			console.dir(res);
			return res;
			
		}).catch(err => err)
	
	
	console.dir(returnValue);
	
};

const _init = () =>{
	
	ajaxHttp("/todo/list","get");
};

