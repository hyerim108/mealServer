# springbootServer

#### MemberMapper.xml
데이터 접근 계층

    <select id="findAll" resultType="com.mealProject.model.MemberModel">
        SELECT * FROM member order by memberNO
    </select>
    <select id="findByName" resultType="com.mealProject.model.MemberModel">
        SELECT * FROM member WHERE memberName = #{memberName}
    </select>
