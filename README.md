# springbootServer

######MemberMapper.xml
  <mapper namespace="com.mealProject.mapper.MemberMapper">
    
    <select id="findAll" resultType="com.mealProject.model.MemberModel">
        SELECT * FROM member order by memberNO
    </select>
    <select id="findByName" resultType="com.mealProject.model.MemberModel">
        SELECT * FROM member WHERE memberName = #{memberName}
    </select>
