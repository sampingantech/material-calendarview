package com.prolificinteractive.materialcalendarview.format;

import java.util.Locale;
import java.time.DayOfWeek;
import java.time.format.TextStyle;

/**
 * Format the day of the week with using {@link TextStyle#SHORT} by default.
 *
 * @see java.time.DayOfWeek#getDisplayName(java.time.format.TextStyle, Locale)
 */
public final class CalendarWeekDayFormatter implements WeekDayFormatter {
  /**
   * {@inheritDoc}
   */
  @Override public CharSequence format(final DayOfWeek dayOfWeek) {
    return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault());
  }
}
