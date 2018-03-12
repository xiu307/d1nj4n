// Generated code from Butter Knife. Do not modify!
package com.diabin.fastec.example;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ExampleDelegate_ViewBinding implements Unbinder {
  private ExampleDelegate target;

  private View view2131624084;

  @UiThread
  public ExampleDelegate_ViewBinding(final ExampleDelegate target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_test, "method 'onClickTest'");
    view2131624084 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickTest();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131624084.setOnClickListener(null);
    view2131624084 = null;
  }
}
