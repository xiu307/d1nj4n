// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.launcher;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LauncherDelegate_ViewBinding implements Unbinder {
  private LauncherDelegate target;

  private View view2131558566;

  @UiThread
  public LauncherDelegate_ViewBinding(final LauncherDelegate target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tv_launcher_timer, "field 'mTvTimer' and method 'onClickTimerView'");
    target.mTvTimer = Utils.castView(view, R.id.tv_launcher_timer, "field 'mTvTimer'", AppCompatTextView.class);
    view2131558566 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickTimerView();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LauncherDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTvTimer = null;

    view2131558566.setOnClickListener(null);
    view2131558566 = null;
  }
}
