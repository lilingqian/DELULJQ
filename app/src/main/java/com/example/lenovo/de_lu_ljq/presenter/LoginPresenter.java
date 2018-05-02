package com.example.lenovo.de_lu_ljq.presenter;

import com.example.lenovo.de_lu_ljq.view.MyView;
import com.example.lenovo.de_lu_ljq.bean.LoginBean;
import com.example.lenovo.de_lu_ljq.model.LoginModel;
import com.example.lenovo.de_lu_ljq.model.ModelCallBack;

public class LoginPresenter {
    LoginModel loginModel = new LoginModel();
    MyView.LoginView loginView;
    public LoginPresenter(MyView.LoginView loginView) {
        this.loginView = loginView;
    }

    public void getData(String tel, String pwd) {
        loginModel.getLoginData(tel,pwd, new ModelCallBack.LoginCallBack() {
            @Override
            public void success(LoginBean dengluBean) {
                loginView.success(dengluBean);
                System.out.println("登录p数据："+dengluBean.toString());
            }

            @Override
            public void failed(Throwable code) {
                System.out.println("登录p错误："+code);
            }
        });
    }
}