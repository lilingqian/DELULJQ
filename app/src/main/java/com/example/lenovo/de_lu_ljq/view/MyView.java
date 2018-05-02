
package com.example.lenovo.de_lu_ljq.view;

import com.example.lenovo.de_lu_ljq.bean.LoginBean;
import com.example.lenovo.de_lu_ljq.bean.PersonInfoBean;
import com.example.lenovo.de_lu_ljq.bean.RegBean;

public interface MyView {
    //登录页面由presenter层交互数据到view层MainActivity
    public interface LoginView{
        //登录时，数据获取成功的方法，返回一个值表示登陆成功
        void success(LoginBean loginBean);
        //登录时，数据获取失败的方法，返回一个int值响应码表示登陆失败
        void failed(int code);
    }

    //注册页面由presenter层到view层RegActivity
    public interface RegView{

        void failed(int code);
        void sucess(RegBean regBean);
    }

    //个人页面由presenter层到view层RegActivity
    public interface PersonView{
        void failed(int code);
        void sucess(PersonInfoBean personInfoBean);
    }
}