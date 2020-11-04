<template>
  <div>
    <img class="bg" src="@/assets/img/bg.jpg">
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" class="login-form">
      <h1 class="h1">园林植被信息管理前端系统注册</h1>
                              <el-form-item v-if="tableName=='yuangong'" label="工号" prop="yuangonggonghao">
        <el-input v-model="ruleForm.gonghao" placeholder="工号"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='yuangong'" label="密码" prop="yuangongmima">
        <el-input v-model="ruleForm.mima" placeholder="密码"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='yuangong'" label="姓名" prop="yuangongxingming">
        <el-input v-model="ruleForm.xingming" placeholder="姓名"></el-input>
      </el-form-item>
                                          <el-form-item v-if="tableName=='yuangong'" label="区域" prop="yuangongquyu">
        <el-input v-model="ruleForm.quyu" placeholder="区域"></el-input>
      </el-form-item>
                                                            <el-form-item v-if="tableName=='yuangong'" label="身份证" prop="yuangongshenfenzheng">
        <el-input v-model="ruleForm.shenfenzheng" placeholder="身份证"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='yuangong'" label="电话" prop="yuangongdianhua">
        <el-input v-model="ruleForm.dianhua" placeholder="电话"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='yuangong'" label="账号" prop="yuangongzhanghao">
        <el-input v-model="ruleForm.zhanghao" placeholder="账号"></el-input>
      </el-form-item>
                                                <el-form-item v-if="tableName=='quyuguanlirenyuan'" label="账号" prop="quyuguanlirenyuanzhanghao">
        <el-input v-model="ruleForm.zhanghao" placeholder="账号"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='quyuguanlirenyuan'" label="密码" prop="quyuguanlirenyuanmima">
        <el-input v-model="ruleForm.mima" placeholder="密码"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='quyuguanlirenyuan'" label="姓名" prop="quyuguanlirenyuanxingming">
        <el-input v-model="ruleForm.xingming" placeholder="姓名"></el-input>
      </el-form-item>
                                                            <el-form-item v-if="tableName=='quyuguanlirenyuan'" label="负责区域" prop="quyuguanlirenyuanfuzequyu">
        <el-input v-model="ruleForm.fuzequyu" placeholder="负责区域"></el-input>
      </el-form-item>
                                          <el-form-item v-if="tableName=='quyuguanlirenyuan'" label="身份证" prop="quyuguanlirenyuanshenfenzheng">
        <el-input v-model="ruleForm.shenfenzheng" placeholder="身份证"></el-input>
      </el-form-item>
                        <el-form-item v-if="tableName=='quyuguanlirenyuan'" label="手机" prop="quyuguanlirenyuanshouji">
        <el-input v-model="ruleForm.shouji" placeholder="手机"></el-input>
      </el-form-item>
                                                                                          <el-button @click="login()" class="btn-login" type="primary">注册</el-button>
    </el-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
              },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 注册
    login() {
                              if((!this.ruleForm.gonghao) && `yuangong` == this.tableName){
        this.$message.error(`工号不能为空`);
        return
      }
                                                            if((!this.ruleForm.mima) && `yuangong` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                                                                                                                                                                                                                                                                                          if(`yuangong` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
                                                if(`yuangong` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入电话格式`);
        return
      }
                                                                                                                  if((!this.ruleForm.zhanghao) && `quyuguanlirenyuan` == this.tableName){
        this.$message.error(`账号不能为空`);
        return
      }
                                                            if((!this.ruleForm.mima) && `quyuguanlirenyuan` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                                                                                                                                                                                                                                                                                          if(`quyuguanlirenyuan` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
                                                if(`quyuguanlirenyuan` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入电话格式`);
        return
      }
                                                                                                            this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `${this.tableName}/register`,
            method: "post",
            data:this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$router.replace({ path: "/login" });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
