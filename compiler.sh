#!/bin/bash

find . -name "*.class" -type f -delete;
javac FrontEnd.java && java FrontEnd
