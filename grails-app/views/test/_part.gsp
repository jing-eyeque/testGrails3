%{--<p>Hello ${name}</p>--}%


        %{--<label>First Name</label>--}%
        %{--<g:textField name="First Name" value="${name}" readonly="readonly"/>--}%


    <g:if test="${editingTest == true}">
        <label>First Name</label>
        <g:textField name="firstName" value="${name}"/>
        <g:remoteLink controller="test" action="saveSubject" update="overview">
            <input type="button" value="Save" class="button"/>
            %{--<g:actionSubmit value="Save" action="saveSubject"/>--}%
        </g:remoteLink>
    </g:if>

    <g:else>
        <label>First Name</label>
        <g:textField name="firstName" value="${name}" readonly="readonly"/>
        <g:remoteLink controller="test" action="editSubject" update="overview">
            <input type="button" value="Edit" class="button"/>
        </g:remoteLink>
    </g:else>


