
    <g:if test="${editingTest == true}">
        <g:formRemote name="subForm" url="[controller:'test', action:'saveSubject2']" update="overview">
            <label>First Name</label>
            <g:textField name="firstName" value="${firstName}"/>
             <g:submitButton name="Save" />
        </g:formRemote>
    </g:if>

    <g:else>
        <g:formRemote name="subForm" url="[controller:'test', action:'editSubject2']" update="overview">
            <label>First Name</label>
            <g:textField name="firstName" value="${firstName}" readonly="readonly"/>
            <g:submitButton name="Edit" />
        </g:formRemote>

    </g:else>
