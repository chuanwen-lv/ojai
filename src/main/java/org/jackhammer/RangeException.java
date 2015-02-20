/**
 * Copyright (c) 2014 MapR, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jackhammer;

public class RangeException extends RuntimeException {

  private static final long serialVersionUID = 0x2bd611d8be247f3eL;

  public RangeException() {
    super();
  }

  public RangeException(String message, Throwable cause) {
    super(message, cause);
  }

  public RangeException(String message) {
    super(message);
  }

  public RangeException(Throwable cause) {
    super(cause);
  }

}
