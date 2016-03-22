package ru.prog.home.project;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by gavanesov on 22.03.2016.
 */
public class DistancePointTest {

  @Test
  public void TestDistancePoint(){
    Point p1 = new Point(3,4);
    Point p2 = new Point(6,8);
    assert p1.distance(p2,p1) ==  5.0;

  }
}
