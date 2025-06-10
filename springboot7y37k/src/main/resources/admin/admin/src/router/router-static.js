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
    import kefuguanli from '@/views/modules/kefuguanli/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
    import jingquxinxi from '@/views/modules/jingquxinxi/list'
    import jingqushangcheng from '@/views/modules/jingqushangcheng/list'
    import orders from '@/views/modules/orders/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import yonghufenxiang from '@/views/modules/yonghufenxiang/list'
    import jingqufenlei from '@/views/modules/jingqufenlei/list'
    import tousujianyi from '@/views/modules/tousujianyi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/kefuguanli',
        name: '客服管理',
        component: kefuguanli
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/shangpinfenlei',
        name: '商品分类',
        component: shangpinfenlei
      }
          ,{
	path: '/jingquxinxi',
        name: '景区信息',
        component: jingquxinxi
      }
          ,{
	path: '/jingqushangcheng',
        name: '景区商城',
        component: jingqushangcheng
      }
          ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/yonghufenxiang',
        name: '用户分享',
        component: yonghufenxiang
      }
          ,{
	path: '/jingqufenlei',
        name: '景区分类',
        component: jingqufenlei
      }
          ,{
	path: '/tousujianyi',
        name: '投诉建议',
        component: tousujianyi
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
