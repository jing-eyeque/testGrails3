<%--
  Created by IntelliJ IDEA.
  User: eyeque
  Date: 12/23/15
  Time: 3:17 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta name="layout" content="main"/>
    <g:javascript library="jquery" />
</head>

<body>

<g:form controller="test">
    <div id="overview">
        <g:render template="part" />
    </div>


    %{--<g:if test="${editingTest == true}">--}%

        %{--<g:remoteLink controller="test" action="saveSubject" update="overview">--}%
            %{--<input type="button" value="Save" class="button"/>--}%
        %{--</g:remoteLink>--}%
    %{--</g:if>--}%

    %{--<g:else>--}%

        %{--<g:remoteLink controller="test" action="editSubject" update="overview">--}%
            %{--<input type="button" value="Edit" class="button"/>--}%
        %{--</g:remoteLink>--}%
    %{--</g:else>--}%

    %{--<g:remotelink controller="test" action="editSubject" update="test overview">--}%
        %{--<input type="button" value="Edit" class="button"/>--}%
    %{--</g:remotelink>--}%

</g:form>

</body>
</html>