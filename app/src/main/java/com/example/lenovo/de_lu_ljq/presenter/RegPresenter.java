
package com.example.lenovo.de_lu_ljq.presenter;

import com.example.lenovo.de_lu_ljq.view.MyView;
import com.example.lenovo.de_lu_ljq.bean.RegBean;
import com.example.lenovo.de_lu_ljq.model.ModelCallBack;
import com.example.lenovo.de_lu_ljq.model.RegModel;

public class RegPresenter {

    RegModel regModel = new RegModel();
    MyView.RegView regView;
    public RegPresenter(MyView.RegView regView) {
        this.regView = regView;
    }

    public void getData(String tel, String pwd) {
        regModel.getRegData(tel,pwd, new ModelCallBack.RegCallBack() {

            @Override
            public void success(RegBean regBean) {
                regView.sucess(regBean);
                System.out.println("注册p数据："+regBean.toString());
            }

            @Override
            public void failed(Throwable code) {
                System.out.println("注册p错误："+code);
            }
        });
    }
}