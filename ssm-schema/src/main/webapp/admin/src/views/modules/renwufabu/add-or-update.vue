<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
      <el-row>
                  <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="标题" prop="biaoti">
          <el-input v-model="ruleForm.biaoti" 
              placeholder="标题" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.biaoti" label="标题" prop="biaoti">
              <el-input v-model="ruleForm.biaoti" 
                placeholder="标题" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="type!='info'" label="工号" prop="gonghao">
          <el-select  @change="gonghaoChange" v-model="ruleForm.gonghao" placeholder="请选择工号">
            <el-option
                v-for="(item,index) in gonghaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.gonghao" label="工号" prop="gonghao">
              <el-input v-model="ruleForm.gonghao" 
                placeholder="工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.xingming" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="区域" prop="quyu">
          <el-input v-model="ruleForm.quyu" 
              placeholder="区域" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.quyu" label="区域" prop="quyu">
              <el-input v-model="ruleForm.quyu" 
                placeholder="区域" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                          <el-col :span="12">
        <el-form-item  v-if="type!='info'" label="任务日期" prop="renwuriqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.renwuriqi" 
                type="date"
                placeholder="任务日期">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.renwuriqi" label="任务日期" prop="renwuriqi">
              <el-input v-model="ruleForm.renwuriqi" 
                placeholder="任务日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        <el-col :span="12">
        <el-form-item  v-if="type!='info'"  label="账号" prop="zhanghao">
          <el-input v-model="ruleForm.zhanghao" 
              placeholder="账号" clearable></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.zhanghao" label="账号" prop="zhanghao">
              <el-input v-model="ruleForm.zhanghao" 
                placeholder="账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                        </el-row>
                                                                                <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'" label="工作要求" prop="gongzuoyaoqiu">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="工作要求"
                  v-model="ruleForm.gongzuoyaoqiu">
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.gongzuoyaoqiu" label="工作要求" prop="gongzuoyaoqiu">
                    <span>{{ruleForm.gongzuoyaoqiu}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
                                                                                                                                                        <el-form-item>
                <el-button v-if="type!='info'" type="primary" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
      id: '',
      type: '',
            ruleForm: {
                        biaoti: '',
                                gonghao: '',
                                xingming: '',
                                quyu: '',
                                gongzuoyaoqiu: '',
                                renwuriqi: '',
                                zhanghao: '',
                      },
                                      gonghaoOptions: [],
                                                                                          rules: {
                  biaoti: [
                            { required: true, message: '标题不能为空', trigger: 'blur' },
                                                                                              ],
                  gonghao: [
                                                                                              ],
                  xingming: [
                                                                                              ],
                  quyu: [
                                                                                              ],
                  gongzuoyaoqiu: [
                                                                                              ],
                  renwuriqi: [
                                                                                              ],
                  zhanghao: [
                                                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                          },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
                    if(o=='biaoti'){
            this.ruleForm.biaoti = obj[o];
            continue;
          }
                    if(o=='gonghao'){
            this.ruleForm.gonghao = obj[o];
            continue;
          }
                    if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
            continue;
          }
                    if(o=='quyu'){
            this.ruleForm.quyu = obj[o];
            continue;
          }
                    if(o=='gongzuoyaoqiu'){
            this.ruleForm.gongzuoyaoqiu = obj[o];
            continue;
          }
                    if(o=='renwuriqi'){
            this.ruleForm.renwuriqi = obj[o];
            continue;
          }
                    if(o=='zhanghao'){
            this.ruleForm.zhanghao = obj[o];
            continue;
          }
                  }
                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                                                                                                                        this.ruleForm.zhanghao = json.zhanghao
                              } else {
          this.$message.error(data.msg);
        }
      });
                                                            this.$http({
              url: `option/yuangong/gonghao`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.gonghaoOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
                                                                                                                      },
                    // 下二随
    gonghaoChange () {
      this.$http({
        url: `follow/yuangong/gonghao?columnValue=`+ this.ruleForm.gonghao,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
                                                                                if(data.data.xingming){
                this.ruleForm.xingming = data.data.xingming
              }
                                                if(data.data.quyu){
                this.ruleForm.quyu = data.data.quyu
              }
                                                                                                } else {
          this.$message.error(data.msg);
        }
      });
    },
                                                    // 多级联动参数
                                                                                  info(id) {
      this.$http({
        url: `renwufabu/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                  this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `renwufabu/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.renwufabuCrossAddOrUpdateFlag = false;
                  this.parent.search();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.renwufabuCrossAddOrUpdateFlag = false;
    },
                                                                                          }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
</style>
