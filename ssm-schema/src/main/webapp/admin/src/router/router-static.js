import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import bumenxinxi from '@/views/modules/bumenxinxi/list'
    import yuangong from '@/views/modules/yuangong/list'
    import yuanlinrenwu from '@/views/modules/yuanlinrenwu/list'
    import lunbotuguanli from '@/views/modules/lunbotuguanli/list'
    import zhibeixinxi from '@/views/modules/zhibeixinxi/list'
    import renwufabu from '@/views/modules/renwufabu/list'
    import quyuguanlirenyuan from '@/views/modules/quyuguanlirenyuan/list'
    import yuanlinbaogao from '@/views/modules/yuanlinbaogao/list'

//2.配置路由   注意：名字
const routes = [
    {
        path: '/index', name:'index', component: Index, children: [{
            // 这里不设置值，是把main作为默认页面
            path: '/',
            name: 'home',
            component: Home
        },{
            path: '/updatePassword',
            name: 'updatePassword',
            component: UpdatePassword
        } ,{
            path: '/pay',
            name: 'pay',
            component: pay
        } ,{
            path: '/center',
            name: 'center',
            component: center
        } 
                    ,{
                path: '/bumenxinxi',
                name: 'bumenxinxi',
                component: bumenxinxi
            } 
                    ,{
                path: '/yuangong',
                name: 'yuangong',
                component: yuangong
            } 
                    ,{
                path: '/yuanlinrenwu',
                name: 'yuanlinrenwu',
                component: yuanlinrenwu
            } 
                    ,{
                path: '/lunbotuguanli',
                name: 'lunbotuguanli',
                component: lunbotuguanli
            } 
                    ,{
                path: '/zhibeixinxi',
                name: 'zhibeixinxi',
                component: zhibeixinxi
            } 
                    ,{
                path: '/renwufabu',
                name: 'renwufabu',
                component: renwufabu
            } 
                    ,{
                path: '/quyuguanlirenyuan',
                name: 'quyuguanlirenyuan',
                component: quyuguanlirenyuan
            } 
                    ,{
                path: '/yuanlinbaogao',
                name: 'yuanlinbaogao',
                component: yuanlinbaogao
            } 
                ]
    },
    { path: '/adminexam', name: 'adminexam', component: adminexam },
    { path: '/login', name:'login', component: Login },
    { path: '/register', name:'register', component: register },
    { path: '/', redirect: '/index/' },      /*默认跳转路由*/
    { path: '*', component: NotFound }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
    mode: 'hash',   /*hash模式改为history*/
    routes // （缩写）相当于 routes: routes
})

export default router;

