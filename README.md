# springbootServer

> #### MemberMapper.xml
> > 데이터 접근 계층

    <select id="findAll" resultType="com.mealProject.model.MemberModel">
        SELECT * FROM member order by memberNO
    </select>
    <select id="findByName" resultType="com.mealProject.model.MemberModel">
        SELECT * FROM member WHERE memberName = #{memberName}
    </select>

> infoController
<img width="882" alt="스크린샷 2023-03-06 오후 4 02 05" src="https://user-images.githubusercontent.com/92422637/223040943-59dbeae7-41d3-45ab-855c-5035917c097f.png">
