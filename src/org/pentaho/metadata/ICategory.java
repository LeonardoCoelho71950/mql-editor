package org.pentaho.metadata;

import java.io.Serializable;
import java.util.List;

public interface ICategory<T extends IBusinessColumn> extends Serializable {

  public String getId();

  public String getName();

  public List<T> getBusinessColumns();
  
}
