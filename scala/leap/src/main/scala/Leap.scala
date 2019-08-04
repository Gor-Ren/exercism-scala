object Leap {

  def leapYear(year: Int): Boolean =
    (year % 4 == 0) && !isCenturyOverride(year)

  /** Returns true three out of every four century years, which are non-leap. */
  def isCenturyOverride(year: Int): Boolean =
    (year % 100 == 0) && !(year % 400 == 0)
}
