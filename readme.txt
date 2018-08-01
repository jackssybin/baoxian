
##1.generate mybatis
    int deleteByBxId(String bxId);

    <delete id="deleteByBxId" parameterType="java.lang.String">
        delete from bx_shouxian
        where bx_id = #{bxId,jdbcType=VARCHAR}
      </delete>

