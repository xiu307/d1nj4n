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

public class SignUpDelegate_ViewBinding implements Unbinder {
  private SignUpDelegate target;

  private View view2131558609;

  private View view2131558610;

  @UiThread
  public SignUpDelegate_ViewBinding(final SignUpDelegate target, View source) {
    this.target = target;

    View view;
    target.mName = Utils.findRequiredViewAsType(source, R.id.edit_sign_up_name, "field 'mName'", TextInputEditText.class);
    target.mEmail = Utils.findRequiredViewAsType(source, R.id.edit_sign_up_email, "field 'mEmail'", TextInputEditText.class);
    target.mPhone = Utils.findRequiredViewAsType(source, R.id.edit_sign_up_phone, "field 'mPhone'", TextInputEditText.class);
    target.mPassword = Utils.findRequiredViewAsType(source, R.id.edit_sign_up_password, "field 'mPassword'", TextInputEditText.class);
    target.mRePassword = Utils.findRequiredViewAsType(source, R.id.edit_sign_up_re_password, "field 'mRePassword'", TextInputEditText.class);
    view = Utils.findRequiredView(source, R.id.btn_sign_up, "method 'onClickSignUp'");
    view2131558609 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSignUp();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_link_sign_in, "method 'onClickLink'");
    view2131558610 = view;
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
    SignUpDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mName = null;
    target.mEmail = null;
    target.mPhone = null;
    target.mPassword = null;
    target.mRePassword = null;

    view2131558609.setOnClickListener(null);
    view2131558609 = null;
    view2131558610.setOnClickListener(null);
    view2131558610 = null;
  }
}
