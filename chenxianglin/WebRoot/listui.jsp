<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML>
<html>
  <head>

    
    <title>12 月考试</title>
    <!-- 导入eazyui所需所有包和样式 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/easyui/themes/icon.css" />
<script
	src="${pageContext.request.contextPath }/resources/easyui/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath }/resources/easyui/jquery.easyui.min.js"></script>
<script
	src="${pageContext.request.contextPath }/resources/easyui/locale/easyui-lang-zh_CN.js"></script>
  </head>
  
  <body>
  <!-- 数据显示层 -->
	<div style="margin-top: 10px">
			<table id="staffDataGrid">

			</table>
		</div>
	
	
	
	
  </body>
  <script type="text/javascript">
  					
			$("#staffDataGrid").datagrid({
				url : "staffui_list",
        title : '部门员工信息表',
        fitColumns : true, 
        striped : true,    
        rownumbers : true, 
        columns:[[{ 
          field : 'ename',  
          title : '员工姓名',
          width : 50,
          checkbox : true,
        }, {
          field : 'dname',
          title : '部门姓名',
          width : 100,
          sortable : true,
        }, {
          field : 'job',
          title : '职位',
          width : 200,
          sortable : true,
        }, {
          field : 'loc',
          title : '部门位置',
          width : 100,
          sortable : true,
        }, {
          field : 'sal',
          title : '员工工资',
          width : 100,
          sortable : true,
        }]], 
        pagination : true, 
        pageSize : 5,
        pageList : [5, 10, 15, 20, 50 ],
        sortName : "sal", 
        sortOrder : "desc",
			});

  </script>
</html>
