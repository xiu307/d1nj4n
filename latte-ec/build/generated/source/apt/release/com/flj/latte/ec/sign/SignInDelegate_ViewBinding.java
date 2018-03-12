// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.sign;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SignInDelegate_ViewBinding implements Unbinder {
  private SignInDelegate target;

  private View view2131558601;

  private View view2131558603;

  private View view2131558602;

  @UiThread
  public SignInDelegate_ViewBinding(final SignInDelegate target, View source) {
    this.target = target;

    View view;
    target.mEmail = Utils.findRequiredViewAsType(source, R.id.edit_sign_in_email, "field 'mEmail'", TextInputEditText.class);
    target.mPassword = Utils.findRequiredViewAsType(source, R.id.edit_sign_in_password, "field 'mPassword'", TextInputEditText.class);
    view = Utils.findRequiredView(source, R.id.btn_sign_in, "method 'onClickSignIn'");
    view2131558601 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSignIn();
      }
    });
    view = Utils.findRequiredView(source, R.id.icon_sign_in_wechat, "method 'onClickWeChat'");
    view2131558603 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickWeChat();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_link_sign_up, "method 'onClickLink'");
    view2131558602 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickLink();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SignInDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEmail = null;
    target.mPassword = null;

    view2131558601.setOnClickListener(null);
    view2131558601 = null;
    view2131558603.setOnClickListener(null);
    view2131558603 = null;
    view2131558602.setOnClickListener(null);
    view2131558602 = null;
  }
}
