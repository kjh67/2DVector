/*
 * Copyright 2021 K.J. Hawkins <kjh67@cam.ac.uk>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.kjh67.Vector2D;

public class Vector2D {
    private double x;
    private double y;

    Vector2D() {new Vector2D(0.0,0.0);}

    Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector2D v2) {
        this.x = this.x + v2.x;
        this.y = this.y + v2.y;
    }

    public double scalarProduct(Vector2D v2) {
        return (this.x * v2.x) + (this.y * v2.y);
    }

    public double magnitude() {
        return Math.sqrt((x * x) + (y * y));
    }

    public void normalise() {
        double magnitude = this.magnitude();
        x = x/magnitude;
        y = y/magnitude;
    }
}
