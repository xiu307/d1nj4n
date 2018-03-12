// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.main.personal.order;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import com.flj.latte.ui.widget.AutoPhotoLayout;
import com.flj.latte.ui.widget.StarLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OrderCommentDelegate_ViewBinding implements Unbinder {
  private OrderCommentDelegate target;

  private View view2131558571;

  @UiThread
  public OrderCommentDelegate_ViewBinding(final OrderCommentDelegate target, View source) {
    this.target = target;

    View view;
    target.mStarLayout = Utils.findRequiredViewAsType(source, R.id.custom_star_layout, "field 'mStarLayout'", StarLayout.class);
    target.mAutoPhotoLayout = Utils.findRequiredViewAsType(source, R.id.custom_auto_photo_layout, "field 'mAutoPhotoLayout'", AutoPhotoLayout.class);
    view = Utils.findRequiredView(source, R.id.top_tv_comment_commit, "method 'onClickSubmit'");
    view2131558571 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSubmit();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    OrderCommentDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStarLayout = null;
    target.mAutoPhotoLayout = null;

    view2131558571.setOnClickListener(null);
    view2131558571 = null;
  }
}
