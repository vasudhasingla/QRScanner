/*
 * Copyright 2009 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.common.AbstractBlackBoxTestCase;

/**
 * This test contains 480x240 images captured from an Android device at preview resolution.
 *
 * @author dswitkin@google.com (Daniel Switkin)
 */
public final class PDF417BlackBox2TestCase extends AbstractBlackBoxTestCase {

  public PDF417BlackBox2TestCase() {
    super("test/data/blackbox/pdf417-2", new MultiFormatReader(), BarcodeFormat.PDF_417);
    // TODO this should be 25,25,0,0
    addTest(23, 23, 1, 1, 0.0f);
    addTest(23, 23, 1, 1, 180.0f);
  }

}
