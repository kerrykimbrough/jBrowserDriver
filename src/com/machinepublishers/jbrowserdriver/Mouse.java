/* 
 * jBrowserDriver (TM)
 * Copyright (C) 2014-2016 Machine Publishers, LLC and the jBrowserDriver contributors
 * https://github.com/MachinePublishers/jBrowserDriver
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.machinepublishers.jbrowserdriver;

class Mouse implements org.openqa.selenium.interactions.Mouse {
  private final MouseRemote remote;
  private final SocketLock lock;

  Mouse(MouseRemote remote, SocketLock lock) {
    this.remote = remote;
    this.lock = lock;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void click(org.openqa.selenium.interactions.internal.Coordinates coords) {
    try {
      synchronized (lock) {
        remote.remoteClick(coords == null ? null : new Coordinates(coords));
      }
    } catch (Throwable t) {
      Util.handleException(t);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void contextClick(org.openqa.selenium.interactions.internal.Coordinates coords) {
    try {
      synchronized (lock) {
        remote.remoteContextClick(coords == null ? null : new Coordinates(coords));
      }
    } catch (Throwable t) {
      Util.handleException(t);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void doubleClick(org.openqa.selenium.interactions.internal.Coordinates coords) {
    try {
      synchronized (lock) {
        remote.remoteDoubleClick(coords == null ? null : new Coordinates(coords));
      }
    } catch (Throwable t) {
      Util.handleException(t);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void mouseDown(org.openqa.selenium.interactions.internal.Coordinates coords) {
    try {
      synchronized (lock) {
        remote.remoteMouseDown(coords == null ? null : new Coordinates(coords));
      }
    } catch (Throwable t) {
      Util.handleException(t);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void mouseMove(org.openqa.selenium.interactions.internal.Coordinates coords) {
    try {
      synchronized (lock) {
        remote.remoteMouseMove(coords == null ? null : new Coordinates(coords));
      }
    } catch (Throwable t) {
      Util.handleException(t);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void mouseMove(org.openqa.selenium.interactions.internal.Coordinates coords, long xOffset, long yOffset) {
    try {
      synchronized (lock) {
        remote.remoteMouseMove(coords == null ? null : new Coordinates(coords), xOffset, yOffset);
      }
    } catch (Throwable t) {
      Util.handleException(t);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void mouseUp(org.openqa.selenium.interactions.internal.Coordinates coords) {
    try {
      synchronized (lock) {
        remote.remoteMouseUp(coords == null ? null : new Coordinates(coords));
      }
    } catch (Throwable t) {
      Util.handleException(t);
    }
  }
}
