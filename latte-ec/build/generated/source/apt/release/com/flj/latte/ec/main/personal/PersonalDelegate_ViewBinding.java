// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.main.personal;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PersonalDelegate_ViewBinding implements Unbinder {
  private PersonalDelegate target;

  private View view2131558579;

  private View view2131558578;

  @UiThread
  public PersonalDelegate_ViewBinding(final PersonalDelegate target, View source) {
    this.target = target;

    View view;
    target.mRvSettings = Utils.findRequiredViewAsType(source, R.id.rv_personal_setting, "field 'mRvSettings'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.tv_all_order, "method 'onClickAllOrder'");
    view2131558579 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickAllOrder();
      }
    });
    view = Utils.findRequiredView(source, R.id.img_user_avatar, "method 'onClickAvatar'");
    view2131558578 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickAvatar();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PersonalDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRvSettings = null;

    view2131558579.setOnClickListener(null);
    view2131558579 = null;
    view2131558578.setOnClickListener(null);
    view2131558578 = null;
  }
}
