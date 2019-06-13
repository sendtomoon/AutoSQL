$(document).ready(function () {
	flushRows();
});
function flushRows(){
	$("#dataTable tbody  tr:odd").css("background-color", "#C6E0B4");   
	$("#dataTable tbody  tr:even").css("background-color","#E2EFDA");    
	$("#dataTable tbody  tr:odd").addClass("odd");
	$("#dataTable tbody  tr:even").addClass("even");
}
function rowValue(filed,type,comment){
	var len = $('#dataTable tbody tr').length;
	var html = '<tr height="40px" ><td align="center" >'+(len+1)+
	'</td><td><input height="40px" value="'+filed+'" /></td><td><input height="40px" value="'+type+'" />'+
	'</td><td width="250px"><input height="40px" value="'+comment+'" width="250px"/></td>'+
	'<td><button onclick="delRow(this)" >删除</button></td></tr>';
	return html;
}
function addTracer(){
	var html1 = rowValue("CREATED_BY","VARCHAR2(64)","创建人");
	var html2 = rowValue("CREATED_DATE","DATE","创建时间");
	var html3 = rowValue("UPDATED_BY","VARCHAR2(64)","修改人");
	var html4 = rowValue("UPDATED_DATE","DATE","修改时间");
	$("#dataTable").append(html1);$("#dataTable").append(html2);$("#dataTable").append(html3);$("#dataTable").append(html4);
	flushRows();
}

function addRow(){
	var html = rowValue("","","");
	$("#dataTable").append(html);
	flushRows();
}

function delRow(sss){
	$(sss).parent().parent().remove();
}

function getSelect(){
	var select = '<select style="width:120px;" onchange="document.getElementById(\'dynInput\').value=this.value"><option value="A类">A类</option><option value="B类">B类</option><option value="C类">C类</option>  <option value="D类">D类</option></select><input id="dynInput" name="input" class="iInput">';
	return select;
}